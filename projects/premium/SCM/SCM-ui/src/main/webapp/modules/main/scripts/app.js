define('homeModule', ['angular'], function (angular) {
    var app = angular.module('home', ['ngRoute']);
    app.config([
        '$httpProvider', function ($httpProvider) {
            $httpProvider.defaults.useXDomain = true;
            delete $httpProvider.defaults.headers.common['X-Requested-With'];
        }
    ]);
    return app;
});

/*Controllers*/
require(['common/scripts/controllers/Auth',
    'common/scripts/directives/layout',
'css!common/resources/css/common.css'], function () {
});