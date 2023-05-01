package Git;

public class GitDefinitions {

	public static void main(String[] args) {
		
		/*
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
What is Git and GitHub
Github is a website provide hosting services for git repo, create wiki page, task management, bug tracking
suppose admin create repository and can have master branch, other branches as well in github	
tom also push code and naveen also pushed code in github and version1 is created
tom and naveen can pull the code v1
tom pushed the code to github and v2 created
now naveen pull the v2 code
v1 and v2 code is git repo and it is stored in github
github is a server
git/SCM(source control management) is tool
push,pull code is happening through git tool


open cmd-> go to project dir -> cd dir
dir-> initailize git-> git init
Note:git is initalized for project (working drir )
git remote add origin https://github.com/SahooHema/JavaConcepts.git 
Note:link established 
git status (pending files to add)
git add .(it will add all files ) ( staging/index)
git commit -m"first commit" (local repo)
git push origin master

Note: for pushing ssh key is required
setting->accout setting-> ssh and gpg keys
for pull no ssh key required

For generating ssh key folow below steps:-
https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent
open gitbash and enter below commands:-
$ ssh-keygen -t ed25519 -C "shema4079@gmail.com"
c/Users/YOU/.ssh/id_ALGORITHM
/c/Users/ADMIN/.ssh.
enter
enter
Note: no need to enter paraphrase
 /c/Users/ADMIN/.ssh/id_ed25519.pub
		
		
		Note: if added new code in project then follow below steps:-
1.cmd:- cd dir
2.git status
3.git add .
4.git status
5.git commit -m"added method name"
6.git push origin master

How to pull code from github?
open cmd->mkdir foldername->enter
cd foldername->enter
git clone https://github.com/SahooHema/JavaConcepts->enter
note:cloning done in this folder

/////////////////////////////////////////
important interview Questions :-
1)LifeCycle Of GIT?
git clone
checkout feature branch signup
git add .
git commit -m "dfdf"
git push signup branch
git merge with master branch

2) difference between Git pull and fetch?
git pull:- take a pull from github repo to eclipse (working directory)
git fetch:- use fetch command for getting pull from github repo(signup branch) to local repo(signup branch). 
it will not reflect in eclipse
use git merge to working dir(eclipse)
formula for git pull:-
git pull= git fetch+merge

3) what is PR Process?
suppose three employee emp1,emp2,emp3. emp1 is TL he push the project code to github and created different branches  i.e. payment an signup.now emp2 & emp3 will pull the code 
emp2 will add code and push to payment branch in github. Now raise a PR To TL and emp3.If both approves then emp2 will merge payment branch code to master branch

4)How to create branch,checkout and merge?
cut matser branch and create feature branch then merge feature with master branch.
In ci/cd create .jar/war file and move to QA env ->prod env

Note:How to remove conflicts? take always pull first and then work on the code and then merge your branch code to the master branch..


////////////////////////////Practical use of GIT commands////////////////
 open cmd-> go the project dir (C:\Users\SUMIT\AutomationProject\JAVA\Hema\JavaConcepts)
 git branch (it shows error) so follow below steps:-
 git pull origin java
 git branch (now also pointing to master)
 git checkout java (it will reflect branch in eclipse also near project name, need to refresh project)
 git branch ( now pointing to java branch)
 git status
 git add . (staging area and shows all file that need to be added)
 git status (shows all code in green)
 git commit -m "added gitcommanddetails"
 git push origin java (refresh github page, see java branch code ,will see new added code)
 Note: see master branch , no new aaded code in master branch
 In github , add pull reqrest(PR) and add comments and see reviewers if added their email id .your msg will be notified to the reviewer.
 Now, reviewer will see the code and cick "+" icon on the code and write comment and send review..
 Now, click finished review and submit review..
 Now update code in eclipse and follow above steps to push code to the java branch
 
 
 
 














		
*/
	}

}
