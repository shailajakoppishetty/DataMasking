# DataMasking
To implement a big data solution to
mask PII ( Personally Identified Information ) in the non-production instances with encrypted values, so
that is not visible.
To read more about PII, refer below link
http://en.wikipedia.org/wiki/Personally_identifiable_information
Following files are provided to you as source data
Account.csv
Contact.csv
Following fields are considered as PII data
Phone #
Email Address 

Load csv files to My SQL Db, Create 2 Hive schemas(Original & masked)
Create Account and
Contact tables in both
Original & masked
schema
Perform sqoop import to
load data from My SQL to
tables in Original Hive
Schema
Write Hive UDF for
masking Email and
Phone#
Insert Overwrite into the
masked schema tables
using the Hive UDF
function
Perform Sqoop export to
MY SQL Db tables from
masked Schema tables
Verify from Hue data
through Hue and SQL
Queries
