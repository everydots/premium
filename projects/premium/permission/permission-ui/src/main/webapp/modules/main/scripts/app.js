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
    'common/scripts/directives/components',
    'css!common/resources/css/common.css'], function () {
});


require(['main/scripts/controllers/main',
    'main/scripts/routes/navigator',
    'main/scripts/controllers/organize'],function(){
});
