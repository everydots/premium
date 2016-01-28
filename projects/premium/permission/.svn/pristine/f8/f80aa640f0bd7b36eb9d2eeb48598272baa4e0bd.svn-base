define(['homeModule'], function (homeModule) {
    homeModule.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: "views/welcome.html"
            })
            .when('/organize', {
                templateUrl: "views/organize.html",
                controller: "organizeController"
            })
            .when("/role", {
                templateUrl: "views/role.html",
                controller: "RoleController"
            })
            .when("/resource", {
                templateUrl: "views/resource.html",
                controller: "ResourceController"
            })
            .when("/assign", {
                templateUrl: "views/assign.html",
                controller: "AssignController"
            })
            .otherwise({
                redirectTo: '/'
            });
    }]);
});
