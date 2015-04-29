FirstApp.controller('scheduleC', [ '$scope', 'scheduleS',
		'$routeParams', function($scope, crudService, $routeParams) {

			$scope.schedules = crudService.query();
		

		} ]);
