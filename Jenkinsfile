node{

	//Define all variables
	def project = 'app-eureka'
	def appName = 'app-eureka-registy'
	def serviceName = "${appName}-backend"  
	def imageVersion = 'development'
	def namespace = 'development'
	def imageTag = "naveenanamaneni2/${project}/${appName}:${imageVersion}.${env.BUILD_NUMBER}"
	
	
	stage('Code Checkout') {
		echo "Code Checking Out in progress"
		git credentialsId: '4744db3f-4ffc-4581-a47c-59e1e7ffe82b', url: 'https://github.com/naveenanamaneni2/app-eureka-registry.git'
		echo "Code Checking Out Completed"
	}
	stage('Maven Build') {
		echo "Build Started"
			def mavenhome = tool name: 'Maven', type: 'maven'
			def mavencmd = "${mavenhome}/bin/mvn"
            sh "${mavencmd} clean package"
             
		echo "Build Success"
	}
	
	 //Stage 3 : Build the docker image.
		  stage('Build image') {
		      sh("docker build -t ${imageTag} .")
		  }
	
}