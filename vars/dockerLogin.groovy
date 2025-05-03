#!/usr/bin/env groovy
def call() {
    com.example.Docker docker = new com.example.Docker(this)
    docker.login()
}
