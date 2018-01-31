# SDE Third Assignment Delivery - Client
#### Gabriele Scarton
###### gabriele.scarton@studenti.unitn.it
This is the client for the third assignment for IntroSDE course at Unitn.
The goal of the assignment is to create a SOAP service composed by a server and a test client.
The server is deployed on Heroku at **sde3-2017-scarton.herokuapp.com** and it's available on the GitHub repository **introsde-2017-assignment-3-server**

##  The code structure
The source code is divided in two part:
- the _SOAP_ package contains all the classes from the server and it was created using the command (under the _src_ folder):
``` 
$ wsimport -keep http://sde3-2017-scarton.herokuapp.com/person?wsdl
```
- the _client_ package contains all the classes for making request and printing the output.

## The code logic
The code in the _client_ package is divided in three classes:
- _MainClient.java_ contains all the requests. The requests are not in order and some of them are called more than once, so every request is commented with the number of the requirement given in the assignment page.
- _PrintUtility.java_ contains the printing methods and the logic for creating and populating a log file.
- _DataUtility.java_ contains the methods for creating random data in order to make proper requests.


## How to run the code
The client is compiled with _ant compile_. In order to query the server and print an output file, the correct ant command is:
``` 
$ ant execute.client 
```
