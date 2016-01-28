define(['angular', 'homeModule'], function (angular, homeModule) {
    homeModule.controller("Auth", ['$scope', '$http', function ($scope, $http) {
        $scope.user = {
            username: 'mock@qq.com',
            password: 'mockpassword'
        }

        $scope.login = function () {
            $http({
                method: 'POST',
                url: 'http://localhost:8080/home/auth/login.do',
                data: JSON.stringify($scope.user)
            }).success(function (p_content) {
                console.log('http invoke success!');
            })
        }
    }])
});