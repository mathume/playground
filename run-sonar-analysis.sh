branch=$(git symbolic-ref HEAD | sed 's!refs\/heads\/!!')
projectKey=playground
echo $projectKey$branch
gradle sonarqube -Dsonar.projectKey=$projectKey-$branch -Dsonar.projectName=$projectKey-$branch
