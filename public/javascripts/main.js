var app = angular.module("app", ["ngResource"])
	.config(["$routeProvider", function($routeProvider) {
		return $routeProvider.when("/", {
			templateUrl: "views/home",
			controller: "TextCtrl"
		}).when("/home", {
			templateUrl: "views/home",
			controller: "TextCtrl"
		}).when("/download", {
			templateUrl: "views/download",
			controller: "TextCtrl"
		}).when("/tutorial", {
			templateUrl: "views/tutorial",
			controller: "TextCtrl"
		}).when("/api", {
			templateUrl: "views/api",
			controller: "TextCtrl"
		}).when("/authors", {
			templateUrl: "views/authors",
			controller: "TextCtrl"
		}).when("/demo", {
			templateUrl: "views/demo",
			controller: "DemoCtrl"
		}).otherwise({
			redirectTo: "/"
		});
	}
	]).config([
	"$locationProvider", function($locationProvider) {
		return $locationProvider.html5Mode(true).hashPrefix("!"); // enable the new HTML5 routing and history API
	}
]);

app.controller("DemoCtrl", ["$scope", "$http", function($scope, $http) {
	$scope.demo = {};

	$scope.translate = function(demo) {
		// $scope.demo.result = "TODO"
		$http.post('/demo/translate', { source: $scope.demo.source })
			.success(function(data) {
				$scope.demo.result = data;
				// debugger;
			}).error(function(data) {
				$scope.demo.result = "error";
			});
	};

	$scope.reset = function() {
		$scope.demo.result = ""
	};

	$scope.reset();
}]);

// Does nothing
app.controller("TextCtrl", ["$scope", "$location", function($scope, $location) {
}]);

// The global controller
app.controller("AppCtrl", ["$scope", "$location", function($scope, $location) {
	// the very sweet go function is inherited to all other controllers
	$scope.go = function (path) {
		$location.path(path);
	};
}]);
