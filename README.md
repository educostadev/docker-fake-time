# Docker Fake Time
A example project that fakes the date and time in a docker container 

This project uses [libfaketime](https://github.com/wolfcw/libfaketime) library and the insight came from [this blog post](https://croz.net/news/using-datefudge-to-fake-docker-date-time-for-testing/).

## How to run

```
git clone <REPOSITORY_URL>
cd docker-fake-time
make dkbuild
make dkrun
```
Access http://localhost:5454/ and see the response body at 2022-01-01.