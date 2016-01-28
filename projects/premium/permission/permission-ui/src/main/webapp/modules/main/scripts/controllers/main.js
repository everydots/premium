define(['homeModule'], function (homeModule) {
    homeModule
        .controller('MainController', ['$scope', function ($scope) {
            $scope.title = "Welcome";
        }])
        .controller('HeaderController', ['$scope', function ($scope) {
            $scope.url="http://localhost:9000/rest";
        }]);
})