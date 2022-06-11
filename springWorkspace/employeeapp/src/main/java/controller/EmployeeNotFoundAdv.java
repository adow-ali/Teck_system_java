package controller;

public class EmployeeNotFoundAdv {
	@ControllerAdvice
	public class EmployeeNotFoundAdv{

	    @ResponseBody
	    @ExceptionHandler(EmployeeNotFoundException.class)
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    String employeeNotFoundHandler(EmployeeNotFoundException ex){
	        return ex.getMessage();
	    }
	}

}
