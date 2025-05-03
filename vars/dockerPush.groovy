#!/usr/bin/env groovy
def call(String imageName) {
    com.example.Docker docker = new com.example.Docker(this)
    docker.pushImage(imageName)
}
