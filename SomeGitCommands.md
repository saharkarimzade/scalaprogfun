$ git clone <your link>
$ git add .
$ git commit -m "message"
$ git push

When my local files was different with root by pull result did not have any action I use this command fo being same as root without second cloning!
Before this command make sure you don not have any change
$ git reset --hard origin/main
in previous case if you have changes use this command
$ git reset --soft origin/main

