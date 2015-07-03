## MultiTenancy Example

**Note:**

This is a very simple multi-tenant example, using Hibernate to realize multi-tenancy.

- Multitenancy strategy : each tenant has a single schema and share one phiscal database

- Connection pool strategy : all tenants sharing one connection pool 

**Version:**

- Spring:4.1.6.RELEASE

- Hibernate:4.3.9.Final

- Mysql:5.6.24

- STS:3.6.4.RELEASE



##简单的多租户例子：

简单的多租户例子，使用SpringMVC+Hibernate实现。

多租户的体现形式是共享一个物理的数据库，租户使用不同的schema，数据库的连接使用共享数据连接池的方式。
