## Main Idea of the project
Create prompt templates. use prompt templates based on some criteria.ex. 
We should create/manage categories for prompts map it with IDEA like antiigravity,cursor AI ,Augment etc... 
Provide templates with placeholders so the user may change a little bit and have new working prompts and rules. 
Prompts can be published and shared with the team and each user may share his/her prompts and rules which can be rated by other users 
The main tool is Prompt and Rule builder tool which should allow us to  customize, visually build the prompt and ability to use different AI based tools to build prompts. 

## The goal is to having multi user system for managing and sharing prompts and templates.

**Backend** 
- Technologies:  mvn, Java21 SpringBoot application, MongoDB 
- Storage:  
	- local non encrypted file storage
	- external storages S3, git repo
- RBAC
	- admin, user, guest

Application should have separate controller for administrator. for now, there is no need to have username/password in database but we can have it in application.yaml or somewhere that we can easily update. 
all provided endpoints should provide json result. 
exception handling should be handled with controller-advice
we need to have separate custom exceptions for the application specific runtime and checked exceptions. 

Templates may support wildcards like `$$TODAY`, `$$NOW` or it can be defined as custom. it should support different visaulization, ex. single select, multiselect, dattime selection.  or just a string/text. 

App should have markdown support. 
Mermaid script designer which means that if prompt is a instruction it can be converted to mermaid script flowchart  to visualize the pormpt message behavior.  

**Frontend**
 - Technologies: pnpm=10, node >=22, nestjs, typescript, axios, zod
