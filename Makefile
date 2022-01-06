mvbuild:
	mvn -T 4C clean package -DskipTests=true

dkbuild: mvbuild
	docker build -t faketime:latest .

dkrun:
	docker run -p 5454:5454 --name=faketime --rm faketime\:latest
