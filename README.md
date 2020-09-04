# springbootdockerdemo

Youtube Video Link;
https://youtu.be/yrm6SFQUqck


Docker Commands:

	Docker Version :
		docker -v
	View Images:
		docker images ls
	Search:
		docker search hello
		docker search --filter stars=100 hello
	Build
		docker build -t springbootdocker .
	Run
		docker run -p8080:8080 springbootdocker
	Start,Stop,Restart
		docker ps -a
		docker container start 25b728bf7350
		docker container stop 25b728bf7350
		docker container restart 25b728bf7350
	Remove Container
		docker rm Containerid
	Remove Image
		docker rmi imageid
	