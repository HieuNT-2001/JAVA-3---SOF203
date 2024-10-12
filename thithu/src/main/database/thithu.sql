-- Create a new database called 'banbe'
-- Connect to the 'master' database to run this snippet
USE master
GO
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT [name]
        FROM sys.databases
        WHERE [name] = N'banbe'
)
CREATE DATABASE banbe
GO

use banbe
go

-- Create a new table called '[ban]' in schema '[dbo]'
-- Drop the table if it already exists
IF OBJECT_ID('[dbo].[ban]', 'U') IS NOT NULL
DROP TABLE [dbo].[ban]
GO
-- Create the table in the specified schema
CREATE TABLE [dbo].[ban]
(
    [Id] INT NOT NULL PRIMARY KEY IDENTITY(1,1), -- Primary Key column
    [name] NVARCHAR(50) NOT NULL,
    [hobby] NVARCHAR(50) NOT NULL,
    [gender] BIT NOT NULL
    -- Specify more columns here
);
GO

-- Insert rows into table 'ban' in schema '[dbo]'
INSERT INTO [dbo].[ban]
( -- Columns to insert data into
 [name], [hobby], [gender]
)
VALUES
( -- First row: values for the columns in the list above
 'Mark', 'sing', 1
),
( -- Second row: values for the columns in the list above
 'Otto', 'dance', 1
)
-- Add more rows here
GO