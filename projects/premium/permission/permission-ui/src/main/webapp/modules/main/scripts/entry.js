/*RequireJs Entry File*/
require.config({
    baseUrl: '/ui/modules',
    paths: {
        angular: 'lib/angular',
        bootstrap: 'lib/bootstrap',
        jquery: 'lib/jquery',
        domReady: 'lib/domReady',
        ngRoute: 'lib/angular-route'
    },
    shim: {
        angular: {
            exports: 'angular'
        },
        ngRoute: {
            deps: ['angular'],
            exports: 'ngRoute'
        },
        jquery: {
            exports: 'jquery'
        },
        bootstrap: {
            deps: [
                'jquery', 'css!lib/bootstrap.min.css'
            ],
            exports: 'bootstrap'
        }
    }
});

require([
    'angular',
    'jquery',
    'ngRoute',
    'bootstrap',
    'main/scripts/app'
], function (angular, $, ngRoute, bootstrap) {
    $("html").attr('ng-app', 'home');
    angular.bootstrap(document, ['home']);
});




