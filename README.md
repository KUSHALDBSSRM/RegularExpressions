# RegularExpressions Programming Assignments

Q1. Write a java program to remove the comments from xml string ?
	Input : <?xml version="1.0" encoding="UTF-8"?><root><a<!-- I'm a comment-->><b/><b/>hola<c i='o'></c></a></root>
	Note: Between <!-- and -->, any text in that section is considered a comment in xml string
	Output: <?xml version=\"1.0\" encoding=\"UTF-8\"?><root ><a ><b /><b /><c i=\"o\" ></c>hola</a></root>

Q2: Write a java program to validate the url?
	Input : Url
	Output: true/false
	Note : Url is valis if it starts with either of the following
		http:// [OR]
		http://www.	[OR]
		https:// [OR]
		https://www.
Q3: Write a java program to get the host name, protocol and path string from given Url string without using URL class?
	Input: UrlString
	Output: hostname: 
		protocol:
		pathString: 
Example: Input:  http://www.example.com:80/path/to/myfile.html?key1=value1&key2=value2
	Output: hostname: www.example.com
		protocol: http
		pathstring: path/to/myfile.html

Q4. Write a java program to check whether given string contains /../ or /./?
	Input: ravindraravula/./
	Output: true

Q5. Write a java program to check whether the given string ended with ".htm" or ".html"?

Q6. Check whether given string represents IPV4 address or not?

		
