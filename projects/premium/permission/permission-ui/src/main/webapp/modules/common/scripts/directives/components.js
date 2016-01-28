define(['angular', 'homeModule'], function (angular, homeModule) {
    homeModule.directive('dotsDropdown', function () {
        return {
            strict: "AE",
            replace: true,
           /* controller: function (scope, element, attrs) {
                /!*scope.products = [{
                    name: "scm",
                    text: "SCM",
                    url: "http://scm.everydots.com"
                }, {
                    name: "permission",
                    text: "PERMISSION",
                    url: "http://permission.everydots.com"
                }, {
                    name: "mpp",
                    text: "MPP",
                    url: "http://mpp.everydots.com"
                }];*!/
            },*/
            templateUrl: "../common/views/dotsDropdown.html"
        }
    })

});
