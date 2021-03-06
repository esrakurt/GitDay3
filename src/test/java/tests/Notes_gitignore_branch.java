package tests;

public class Notes_gitignore_branch {
    /*

02/01/2019
----------

.gitignore

it is a special file where we can list file names or folder names so that git will "ignore" them.

When we say git "ignores" them - we mean git will not track changes to those files/folders.

hello.html

if we have hello.html in the .gitignore file,
whatever happens to that file will not bother git at all.

/target/

if we have /target in .gitignore file, it will ignore anything that is in that folder.

LoginTests.java

LoginTests.class

*.class
================================

1) IN INTELLIJ - create a new MAVEN project,
GitDay3

2) In pom.xml add all dependencies that you have been using so far.

3) Create a "tests" package

4) Create LoginTests.java

5) Create @Test method and name LoginTest1

6) Execute the test
=========

Convert this project into Local Git Repo.

1) Goto terminal within IntelliJ

2) Initialize local repo:
	git init

3) git status

4) We will add .gitignore file into our project root folder. Like pom.xml is in project root folder.

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/
        GitDay3.iml
        pom.xml
        src/
        target/

Now, we will ask git to ignore
.idea/
GitDay3.iml
target/

Todo that, we create a file called ".gitignore"
and add those lines to it then save.

Right click on Project name > New > File >
.gitignore >

Then type : Make sure no spaces
.idea/
GitDay3.iml
target/

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .gitignore
        pom.xml
        src/
=============================

Should I add .gitignore to .gitignore?

Normally no, however if you want any other collaborators to ignore their own files and not like you, then you can ignore it and not push it.

Purpose of .gitignore:

ANy files or folder that are listed in .gitignore file will be ignored by git.
When you say git status , it will not show any changes or anything at all about them.

Common .gitignore

# Eclipse
.classpath
.project
.settings/

# Intellij
.idea/
*.iml
*.iws

# Mac
.DS_Store

# Maven
log/
target/
=======================

Goto GitHub and create GitDay3 repository.

Then run git remote and git push commands that are displayed in the page.

Then refresh the page.
==============================

GIT BRANCHES:

What is git branch?

In git we can have multiple versions of the same repository broken down to branches.

THere is master branch, that is 100% working code
and we need to be careful while pushing our code to master.

Whenever we work on new code. new test case , we can create our own branch and commit everyting there, instead of commiting everything to master branch.

Once we are finish coding new feature or test case , and test it that 100% working , we MERGE it to master branch
===================

List all available branches to me:

git branch

* master

There is only master branch and * means we are on it right now. it means our HEAD of git is pointing to master branch


How to create a branch?

git branch feature

This will only create a branch but will not switch to it.

How to switch to another branch?

git checkout feature


To delete a branch:
git branch -d feature
===========================

git branch ==> show all branches and * will be where HEAD is now. or which is current branch

git branch branchName ==> create new branch based on whatever branch you are.

git checkout branchName ==> switch to branch.

git checkout -b branchname ==> create and switch.
=======================

We have Feature branch, how to merge the feature branch back to MASTER.

1) switch to MASTER first (git checkout master)
2) git merge feature
	--> git bring all the commits/changes from feature branch and merge to master

git log --graph
=================================

1)
So far all the branching was done in local git repository.
We created feature branch and
commited 2 new commits
then merged back to master,
then pushed to origin/master (github repo)

2) Before you pushed your master, someone else pushed some commits to origin/master.

It will not let you to push your code , since you are behind.
=======================

MASTER branch - main branch that will have 100% working code.

1) Merge your feature branch to local master >>> pull from origin/master >> push your master to origin/master

(PULL before PUSH)

2) PULL origin/master to local master >> Solve merge conflicts >> merge feature branch to local MASTER >> push local master to origin/master
===================================

1) switch to feature
2) make a commit
3) goto github master branch and make a commit there, to simulate as if another developer pushed that code.
4) switch to local master
5) pull from origin/master to local master
6) merge feature to local master
	ESC
	:wq
	ENTER
7) push local master to origin/master
=============================

Next class:
	push local custom branches to another custom branch in origin/master then create pull request after code review.

	Stashing.

Summary:
	.gitignore
	git branching
==================================
     */
}
