Script | Action | Expected result | Actual result
-- | -- | -- | --
1-1 opening of main page | open main page using link | main page is opened (all web-items is it their places) | 
2-1 opening of previous/next page user wants using page buttons | open page using previous/next number | all pages are opened | 
3-1 opening of full page any of news | open full page of news | full page of any news is opened (all web-items is it their places) |
4-1 succesful authorization using correct identification data | authorisate using correct and incorrect login and password | succesful authorization using correct identification data, failed authorization using incorrect identification data | 
4-3 displaying of identification data | correctly displayed identification data (name of user and login) after authorization, identification data is not displayed if user is not authorizated | 
5-1 succesful loging out after pushing log out button.
5-2 correctly displayed pages after loging out (with no signs of user).
6-1 correctly displayed adding news page;
6-2 adding news with title, description and text (allows html-insertions);
6-3 correctly displayed page after its adding (title, description, text, date, author);
6-4 inability to add news without authorization.
7-1 correctly displayed delete buttons after authorisation;l
7-2 deleting news;
7-3 displaying of news list without news that has been deleted.
