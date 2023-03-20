Feature: check login functionality for data driven functionality
@Data
Scenario Outline: Following Data driven
Given user will be on Homepage
When user enters valid <username> and <password>
And when he clicks on login button
Then user need to navigate to Landing Page

Examples:
|username|password|
|vinayreddy3337|Innovapath123|
|Srikanth232   |WhiteBox123  |
|Srivastava    |Sri@1997     |
|Vinay3337     |WhiteBox3337 |