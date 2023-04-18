Feature:To validate the functionality of facebook application

Scenario Outline: To validate positive and negative combination of fb functionality
Given  To Launch the chrome browser and maximize window
When  To launch the url
And  To Pass the data "<emaildata>" in email field
And  To Pass the data "<passworddata>" in Password field
And  To click the Login button
Then  To close the browser

Examples:
|emaildata|passworddata|
|raja123@gmail.com|Raja@123|
|kumar143@gmail.com|Kumar143|
|nielson11@gmail.com|niel11|
|ganapathy33@gmail.com|ganapathy|