$ git clone <your link>
$ git add .
$ git commit -m "message"
$ git push

When my local files was different with root by pull result did not have any action I use this command fo being same as root without second cloning!
Before this command make sure you don not have any change
$ git reset --hard origin/main
in previous case if you have changes use this command
$ git reset --soft origin/main

The name of branch should be  lower kebab case: e.g: set-the-change-of-controller
steps for branch:
git branch=> it lists the branches you have! master id default branch!
git branch [yourBranchName that you want to create! Note this part of command is not string]=>create branch by this name theta is the copy of ????
git checkout [the name of branch you want to switch your code]
after that every add and commit and push will be on that master,In the other world This Is Your Active Branch!You are able to see the name of that active branch at the end of your line of git!:)
git log=>you can see the log of ??? last commands on your system
assume you have done your task on your branch and committed( and pushed it: it is optional until this part of work) now you want to merge them
you should switch to parent(in this case master branch) and then merge the child by this command:

git merge [the name of branch you want to merge]=. this merges the branch(thats name is mentioned) into active branch

that command guide you to vim platform that you should write some comment and then type

:wq
and then enter to get out to git platform!
:w =>save
:q=>quite

Note you should write small character to work for vin actions like that! cpitals doesn't work!
after that you should push your branch code and then your master code(merging is a change for master then it needs push)
As I mentioned when you want to push on a branch you should switch to it by checkout command

but pushing on your new branch is not possible, In the other world ther is no new branch "on the server" or internet untill you set upstream, type this:
git push --set-upstream origin [your branch name]

note If the branch has created by anotherOne, and you checked out is, it means that branch is there on server and it doesnt needed any upstream and genereal push is suffisient!


how to delete branch?
switch to that branch and try this:
git branch -d [branchname]
Do u know it deletes the servers branches or not? the answer is No! if you set D replace of d you can do it!:)
while you commit : you save that changes on your local system! then when your system get destroyed your commite files may loos!
while you push: you save the data on the git server(network)! then this is the safest place for your data!
before every push get pull(I should spend time for the type of pull: repase pull or general pull?!)
you may see so much conflicts in push and merge time... you should resolve it  and commit and push time;)

what is rebase pull?



How the companies limit the developers on some git branches like master? they change seeting that they are on gitLab and GitHob and the applications of it
u know when a company use gitLab on its server it uses an platform of gitLab in its servers and Ips...
------
some other words:


creating new branch+check out:
git checkout -b [yourbranchname]

this has the same result of this two commands:(I should try it)
git checkout [yourbranchname]
git commit



git switch(in the newest version of git this command uses=>I should try it)


How we can get branch of some previous versions?

If there was an unsolvable problem and the only way be getting back to a version of past how we can solve it and get back?
  
  
  a useful resource:
  
  NEVER EVER YOU SHOULDNT CHANGE OR COMMIT >GIT FILE BECAUSE IT HAS STH ABOUT THAT PROJECT AT THAT TIM! IT SHOULDNT BE COMITTED NEVERRRRRRRRR!
  https://education.github.com/git-cheat-sheet-education.pdf
