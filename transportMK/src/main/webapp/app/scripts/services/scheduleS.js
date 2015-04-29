var contextPath = "/web-programming/data/rest";

FirstApp.factory('scheduleS', [ '$Resource', function($resource) {
	return $resource(contextPath + '/getData/cityBus', {}, {});
} ]);