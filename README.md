# MultiTenancy-Example
Spring+SpringMVC+Hibernate+Mysql MultiTenancy Example
Each tenant has a single schema share a phiscal database
Single DataSource 
多租户程序实例：
使用SpringMVC+Hibernate实现，多租户的体现形式是共享一个物理的数据库，租户使用不同的schema，数据库的连接使用共享数据连接池的方式
