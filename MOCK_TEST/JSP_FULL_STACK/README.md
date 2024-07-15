JSP Full Stack:
Description
Problem Description
JSP Pages
index.jsp:
Create a task creation form with the following fields:
● Task Title (input type text)
● Task Description (textarea)
● Due Date (input type date)
● Priority (select dropdown with options: High, Medium, Low)
● Include a submit button with the value "Create Task" and id as "createTask"
success.jsp:
If the task creation is successful, display a success message: "Task Created Successfully".
error.jsp:
If there is an error during task creation (e.g., empty fields), display an error message: "Failed to 
create task. Please fill in all the required fields."
Task.java:
Implement a Task class to represent task data with the following private fields:
● title
● description
● dueDate
● priority
Include appropriate constructors, getters, and setters.
CreateTaskServlet.java:
Implement a servlet to handle task creation.
● Retrieve parameters (title, description, dueDate, priority) from the request.
● Check if all parameters are not null and not empty.
● If the parameters are valid, create a new Task object, set it as a request attribute, and 
redirect the user to the success page {proxy_uri}/success.jsp.
● If parameters are invalid, redirect the user to the error page {proxy_uri}/error.jsp.
Note
● Environment Variable Retrieval: The servlet accesses an environment variable named 
"VSCODE_PROXY_URI" using System.getenv() method. This variable contains the URI 
of a proxy server, which is crucial for redirecting users to appropriate JSP pages.
● Redirecting Users: Depending on the authentication result, the servlet redirects users 
to either a success or error JSP page. The redirection URLs are constructed based on 
the proxy URI retrieved from the environment variable.
