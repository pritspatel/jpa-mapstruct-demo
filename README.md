## Spring Dta JPA with Mapstruct and Lombok


### Description

Purpose of this project is to demonstrate how to spring data jpa with lombok
and mapstruct. It also demonstrate how to use DTO object efficiently when your
entities are having many to many or one to many relationships.

Sometime you try to use single dto object for multiple view for the UI and
you unintentionally load the child objects even if your UI does not need it.

So this project will try to solve this problem buy showing how can you avoid
such problems by using different dto object per view.