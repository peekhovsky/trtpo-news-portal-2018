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
6.2.1 [Watch news]
6.2.2.[Signing in]
### 1. Activity diagram<a name="1"></a>
#### 1.1 Reading more<a name="1.1"></a>
![Reading more](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/ReadMore.JPG)
#### 1.2 Finding<a name="1.2"></a>
![Finding](https://github.com/peekhovsky/trtpo-news-portal-2018/blob/master/docs/UMLDiagrams/Activity/Finding.JPG)
#### 1.3 Sharing<a name="1.3"></a>
![Sharing](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/Sharing.JPG)
#### 1.4 Signing<a name="1.4"></a>
![Signing in](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/SingingIn.JPG)
#### 1.5 Adding new news<a name="1.5"></a>
![Adding new news](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/AddNewNews.JPG)
#### 1.6 Watching drafts<a name="1.6"></a>
![Watching drafts](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/WatchDrafts.JPG)
#### 1.7 Deleting<a name="1.7"></a>
![Deleting](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/UMLDiagrams/Activity/Deleting.JPG)
#### 1.8 Loging out<a name="1.8"></a>
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
1. User opens main page
2. App shows news list with short description
3. User push "Read more" button in particular news
4. App shows a page with full information
5. End
##### 6.2.2 Signing In<a name="6.2.1"></a>
**Desctription:** Allows administrator to change information on the site.
Execution thread:
1. Administrator fill fields with login and password data. 
2. App validates this data. If it is incorrect go to p. 4.
3. App sets admin mode (allows to change information).
4. End
