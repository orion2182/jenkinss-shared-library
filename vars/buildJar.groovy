#!/usr/bin/env groovy
def call() {
    echo "🔨 Building JAR..."
    sh "mvn clean package"
}
