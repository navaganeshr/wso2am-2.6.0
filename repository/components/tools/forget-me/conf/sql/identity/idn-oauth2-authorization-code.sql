UPDATE IDN_OAUTH2_AUTHORIZATION_CODE
SET AUTHZ_USER = `pseudonym`, SUBJECT_IDENTIFIER = `pseudonym`
WHERE AUTHZ_USER = `username`
      AND USER_DOMAIN = `user_store_domain`
      AND TENANT_ID = `tenant_id`