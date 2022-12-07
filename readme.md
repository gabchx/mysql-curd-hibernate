



# Hibernate CURD terminal application

Using this code, you'll be able to use JDBC and Hibernate to integrates a PC Bang chain database.


## Get started

1. Pull the code
2. Open with in IntelliJ
3. Adjust the secrets
    - Go to src/main/java/src/GlobalVariables and adjust it  

      `public static int port = **YOUR PORT**;`  
      `public static String host = **YOUR HOST**;`  
      `public static String db_name = **YOUR DATABASE NAME**;`   
      `public static String username = **YOUR USERNAME**;`    
      `public static String password = **YOUR PASSWORD**;`
  
    - Go to src/main/java/ressources/hibernate.cfg.xml and adjust it
      `<property name="connection.url">**YOUR URL**</property>`  
      `<property name="hibernate.connection.username">**YOUR USERNAME**</property>`  
      `<property name="hibernate.connection.password">**YOUR PASSWORD**</property>`
4. Run the code all is done ---
## Note
For adding, and remouving action to work in my-sql please set foreign key check to false

> SET GLOBAL FOREIGN_KEY_CHECKS=0;

## Database schema
![enter image description here](https://lh3.googleusercontent.com/fife/AAbDypCoqprZml5zTaqJ5eXInq7pzbJ6R5FHWwvFU0Lp1vtnw1Dl93zAcpORObxkWh0x3tTFK-1uSuogxgv6-2SPV1Ps32ljsfme9AmQE08gBhqx_C7ZW6rCCvhrxwhD368fup40FBDG1Q54Ye7Q7plC-sHORFXTtdeQllZozdJW7mAShShyxx7at15X-z5RqrkpdSbk95tLlAne9xF239CW8vXmiKMANaVVxmvOAwLmnkTsko_lAZcCjVAZCNg0jRZiBLXSXq0o_gqNU6gUt8AZdKoaO7b3Se2-WijqSoQ37x3ndKSsH-8mZjI2KDEZdw26utjeHqOS8tIMnpJpt6DAB3Ilz7roYRkxchD1Ak-IqlIwLc_WVOoI4yVy7q73ylJTu4Rcml6DDWyDz7Sj3F2yw-faji_JLXtTdQmqFPoIhAgZRdy36FoO5_WC4n6quhYI_7tndXL6P74YiTNZsXjbSCOtjEi3qvOwgRrm5hVjh7R-FqpETivPjGx5WhmSuvz05a5H7idrXCjjz3RXIuOXSZv1GomFdczfrgp_ktF8ePFuijrho8kUgX7VAafW4APeqyxDestGOmMdOfbP3GA2GuM7MYBWF-1RzmXWVi3grzn-fPZ5rfiYRzTW7yBrPIA0T2ZLJ0yag8fQwfYPzLwXUibL2FHg70jyPM5fQLmsEI3IqOm7gTM-4qrOtjPku258rUMgcj1-JSL0bQ8e4TJetHpVpwEIUycpXUNe4aZ1v1jHqls8lVorynhKy1LPbVvvRco3Tn4u4fAroVcFxrp13OiR7I29M85NGLBkcscXkXy4oi7vegjRK9W8PuJ77z1zICVRhmIgRjk9NS63A25bC0LG5rwUY_nPYHt1e36JomPNqBzHdIh4PBOgmAPT7Mu88WEjV4zQFacbRcnJeKUeCyB8YPDAkEwJYb4aJ-D2YJ-AxvcIWIpz4w5JrqBqPzVZNLpJ3VhEWzgItEGJETnvVogmD-ECKil8mPOLtRNGNh7kqzQ-Ef6ng4tAhaCM89kqzYw-mXE2IIAzBLT7vcN31X8i5q0I0Uqm3cQWRuGQ_b1FKmi73CZtwIYC_MiW_ZZJtBJOgKWGgl2dbv53hkilf_pXKJ8zIV9ofdogpy5PZN_MQJmHzsfiwHqcXUxJoGlYVvLA7WdMJwA0CR4-adSaHZo_ecyPYg9iDlPmOLJXLb_uC9XZnLJuZZ1QJYsU0me3jB07r8eH2MHiBcq-4YSMPxNd-Y6YnhrHPXZU33y7Ce8LeoCLiNg9UqdnawkoBaVHnjlXcLCebf9aoiE_ah95sDiCEXJDfJ-JZ2LYe9dOBQbe4JjUzhTI2I9Zvc_Typ_ZWuJj6hs6_BWsetGsXqN7ARrfVmzoVB3z1pt-E3Jz0q021zIh1F1r4IboGh0r0TS0lIGD8AIHAbmZ0FDV4xN9oDOStFolEP0DPqnX2me2QZU6BCs2apaxfhfjQL7AbG81IBZ31VHHD8n96d40cuc=w3352-h1736)
