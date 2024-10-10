CREATE DATABASE QLKH;
GO

USE QLKH;
GO

-- Create a new table called '[users]' in schema '[dbo]'
-- Drop the table if it already exists
IF OBJECT_ID('[dbo].[users]', 'U') IS NOT NULL
DROP TABLE [dbo].[users]
GO
-- Create the table in the specified schema
CREATE TABLE [dbo].[users]
(
    [Id] INT NOT NULL PRIMARY KEY IDENTITY(1,1), -- Primary Key column
    [Type] TINYINT NOT NULL,
    [Name] NVARCHAR(50) NOT NULL,
    [Email] VARCHAR(50) NOT NULL
    -- Specify more columns here
);
GO

-- Insert rows into table 'users' in schema '[dbo]'
INSERT INTO [dbo].[users]
( -- Columns to insert data into
 [Type], [Name], [Email]
)
VALUES
( -- First row: values for the columns in the list above
 1, 'Lâm', 'lamtnk@fpt.edu.vn'
),
( -- Second row: values for the columns in the list above
 0, N'Đức Tài', 'ductai@fpt.edu.vn'
)
-- Add more rows here
GO