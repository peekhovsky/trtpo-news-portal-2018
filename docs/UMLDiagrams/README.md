# UML Diagrams
1. [Activity diagram](#1)<br>
1.1 [Reading more](#1.1)<br>
1.2 [Finding](#1.2)<br>
1.3 [Sharing](#1.3)<br>
1.4 [Signing](#1.4)<br>
1.5 [Adding new news](#1.5)<br>
1.6 [Watching drafts](#1.6)<br>
1.7 [Deleting](#1.7)<br>
1.8 [Loging out](#1.8)<br>
2. [Class diagram](#2)
3. [Sequence diagram](#3)
4. [Statechart diagram](#4)
5. [Deployment diagram](#5)
6. [Use case diagram](#6)<br>
6.1 [Actors](#6.1)<br>
6.2 [Use cases](#6.2)<br>
6.2.1 [Watch news](#6.2.1)<br>
6.2.2.[Signing in](#6.2.2)<br>
6.2.3.[Add and edit news](#6.2.3)<br>
6.2.4.[Delete news](#6.2.4)<br>
6.2.5.[Log out](#6.2.5)<br>
### 1. Activity diagram<a name="1"></a>
#### 1.1 Reading more<a name="1.1"></a>
If user pushes "Read more" button near news description, app will show news page with full information. 
![Reading more](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/ReadMore.JPG)
#### 1.2 Finding<a name="1.2"></a>
If user fill text field and pushes "Find" button, app will find proper news. If there is no appropriate news, it will show "Cannot found" message.
![Finding](https://github.com/peekhovsky/trtpo-news-portal-2018/blob/master/docs/UMLDiagrams/Activity/Finding.JPG)
#### 1.3 Sharing<a name="1.3"></a>
User can share a page in social networks using "Share" button below the page.
![Sharing](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/Sharing.JPG)
#### 1.4 Signing<a name="1.4"></a>
Administrator can sign in using "login" and "password" fields. App will validate data, and if the result is successful, it will turn to admin mode.

![Signing in](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/SingingIn.JPG)
#### 1.5 Adding new news<a name="1.5"></a>
Administrator can add new news using "Add" button. App will open text editor. Administrator can save this text as draft (to continue editing later) or publish it.

![Adding new news](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/AddNewNews.JPG)
#### 1.6 Watching drafts<a name="1.6"></a>
Administrator can watch and edit drafts. App will open text editor. Administrator can save this text as draft (to continue editing later) or publish it.

![Watching drafts](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/WatchDrafts.JPG)
#### 1.7 Deleting<a name="1.7"></a>
Administrator can delete news (and drafts) using "Delete" button. App will detete selected news.

![Deleting](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/Deleting.JPG)
#### 1.8 Loging out<a name="1.8"></a>
If administrator pushes "Log out" button, app will return back to plain user mode.

![Loging out](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/LogOut.JPG)
### 6. Use case diagram<a name="6"></a>
Use case diagram is below:
![Use case](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/UseCase/UseCase.jpg)
#### 6.1 Actors<a name="6.1"></a>
Actor | Description
--- | ---
User | Browses page news list, reads full news pages
Admin | Adds, edits, deletes news, saves drafts 

#### 6.2 Use cases<a name="6.2"></a>
##### 6.2.1 Watch news<a name="6.2.1"></a>
**Desctription:** Allows user to browse page with news list and open full page with news.
Execution thread:
1. User opens main page.
2. App shows news list with short description.
3. User push "Read more" button in particular news.
4. App shows a page with full information.
5. End.
##### 6.2.2 Signing In<a name="6.2.2"></a>
**Desctription:** Allows administrator to enable admin mode on the site.
Execution thread:
1. Administrator fill fields with login and password data. 
2. App validates this data. If data is incorrect go to p. 4.
3. App sets admin mode (allows to change information).
4. End
##### 6.2.3 Add and edit news<a name="6.2.3"></a>
**Desctription:** Allows administrtor to add and change news on the site.
Execution thread:
1. Admin pushs button "Add new" to add new news.
2. App opens page with text editor (user can choose a template from drafts).
3. Admin edits text and publish or saves in drafts (go to p. 5) this text.
4. App pusblishes this text as news (go to p. 6).
5. App saves this text as draft.
6. End.
##### 6.2.4 Delete news<a name="6.2.4"></a>
**Desctription:** Allows administrtor to delete news
Execution thread:
1. Admin pushs button "Delete" in particular news.
2. App deletes this news from main page.
6. End.
##### 6.2.5 Log out<a name="6.2.5"></a>
**Desctription:** Allows administrtor to return back to plain mode.
Execution thread:
1. Admin pushs button "Log out".
2. App returns to plain mode.
6. End.
