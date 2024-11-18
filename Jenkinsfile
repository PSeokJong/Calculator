pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                // Java 소스 파일을 컴파일
                sh "./gradlew compileJava"
            }
        }
        stage("Build") {
            steps {
                // 빌드 및 실행 파일(JAR 등)을 생성
                sh "./gradlew build"
            }
        }
        stage("Unit Test") {
            steps {
                // 테스트 실행
                sh "./gradlew test"
            }
        }
    }
}
