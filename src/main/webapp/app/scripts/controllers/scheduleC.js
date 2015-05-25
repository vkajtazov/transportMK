FirstApp.controller('scheduleC', [
		'$scope',
		'scheduleS',
		function($scope, scheduleS) {

			$scope.lines = scheduleS.query();

			
			
			
			
			$scope.search = function(busLine) {

				if ($scope.lineNumber === undefined
						|| $scope.lineNumber.length === 0) {
					return true;
				}

				var found = false;
				angular.forEach(busLine, function(busLine) {
					if (busLine.line.lineName === parseInt($scope.lineNumber)) {
						found = true;
					}
				});

				return found;
			};

		} ]);
