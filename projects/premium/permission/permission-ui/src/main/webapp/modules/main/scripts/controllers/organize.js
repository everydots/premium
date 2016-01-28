define(['angular', 'homeModule'], function (angular, homeModule) {
    homeModule
        .controller("organizeController", ['$scope', '$http', function ($scope, $http) {
            $scope.title = "develop organize page here!!";
        }])
        .controller("RoleController", ['$scope', '$http', function ($scope, $http) {
            $scope.title = "develop role page here!!";
        }])
        .controller("ResourceController", ['$scope', '$http', function ($scope, $http) {
            $scope.title = "develop resource page here!!";
        }])
        .controller("AssignController", ['$scope', '$http', function ($scope, $http) {
            $scope.title = "develop asign page here!!";
        }])
});