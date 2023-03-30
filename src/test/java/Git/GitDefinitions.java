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
Note:git is initalized for project
git remote add origin https://github.com/SahooHema/JavaConcepts.git 
Note:link established 
git status (pending files to add)
git add .(it will add all files )
git commit -m"first commit"
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

		
*/
	}

}
