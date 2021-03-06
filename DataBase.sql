USE [master]
GO
/****** Object:  Database [ProyectoP]    Script Date: 2/06/2020 7:43:29 a. m. ******/
CREATE DATABASE [ProyectoP]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ProyectoP', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\ProyectoP.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'ProyectoP_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\ProyectoP_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [ProyectoP] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ProyectoP].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ProyectoP] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ProyectoP] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ProyectoP] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ProyectoP] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ProyectoP] SET ARITHABORT OFF 
GO
ALTER DATABASE [ProyectoP] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ProyectoP] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ProyectoP] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ProyectoP] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ProyectoP] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ProyectoP] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ProyectoP] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ProyectoP] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ProyectoP] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ProyectoP] SET  ENABLE_BROKER 
GO
ALTER DATABASE [ProyectoP] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ProyectoP] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ProyectoP] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ProyectoP] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ProyectoP] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ProyectoP] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ProyectoP] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ProyectoP] SET RECOVERY FULL 
GO
ALTER DATABASE [ProyectoP] SET  MULTI_USER 
GO
ALTER DATABASE [ProyectoP] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ProyectoP] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ProyectoP] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ProyectoP] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [ProyectoP] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'ProyectoP', N'ON'
GO
ALTER DATABASE [ProyectoP] SET QUERY_STORE = OFF
GO
USE [ProyectoP]
GO
/****** Object:  Table [dbo].[datosCompra]    Script Date: 2/06/2020 7:43:30 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[datosCompra](
	[numero] [int] NULL,
	[cantidad] [int] NULL,
	[descripcion] [varchar](20) NULL,
	[PrecioxUnidadConIva] [float] NULL,
	[descuentos] [int] NULL,
	[total] [float] NULL,
	[impuestos] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[datosEmisor]    Script Date: 2/06/2020 7:43:31 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[datosEmisor](
	[nombre] [varchar](20) NULL,
	[apellidos] [varchar](20) NULL,
	[NIF] [varchar](20) NULL,
	[domicilio] [varchar](20) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[datosReceptor]    Script Date: 2/06/2020 7:43:32 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[datosReceptor](
	[nombre] [varchar](20) NULL,
	[apellidos] [varchar](20) NULL,
	[NIF] [varchar](20) NULL,
	[domicilio] [varchar](20) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[lugarDeEmision]    Script Date: 2/06/2020 7:43:32 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[lugarDeEmision](
	[lugar] [varchar](20) NULL,
	[fecha] [date] NULL
) ON [PRIMARY]
GO
INSERT [dbo].[datosCompra] ([numero], [cantidad], [descripcion], [PrecioxUnidadConIva], [descuentos], [total], [impuestos]) VALUES (34, 34, N'asd', 23.430000305175781, 1, 32.400001525878906, 3)
INSERT [dbo].[datosEmisor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N'Will', N'Vega', N'828139-4', N'ciudad')
INSERT [dbo].[datosEmisor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N'asd', N'adsf', N'adsf', N'adsf')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
INSERT [dbo].[datosReceptor] ([nombre], [apellidos], [NIF], [domicilio]) VALUES (N' Albert', N' Einstein', N' 674398-0', N' ciudad')
/****** Object:  StoredProcedure [dbo].[EntradaCompra]    Script Date: 2/06/2020 7:43:32 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[EntradaCompra](@numero INT, @cantidad INT, @descripcion VARCHAR(20), @PrecioxUnidadConIva FLOAT, @descuentos INT, @total FLOAT, @impuestos INT)
as begin
insert into datosCompra values (@numero, @cantidad, @descripcion, @PrecioxUnidadConIva, @descuentos, @total, @impuestos)
end
GO
/****** Object:  StoredProcedure [dbo].[EntradaEmisor]    Script Date: 2/06/2020 7:43:32 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[EntradaEmisor](@nombre VARCHAR(20), @apellidos VARCHAR(20), @NIF VARCHAR(20), @domicilio VARCHAR(20))
as begin
insert into datosEmisor values (@nombre,@apellidos,@NIF,@domicilio)
end
GO
/****** Object:  StoredProcedure [dbo].[EntradaReceptor]    Script Date: 2/06/2020 7:43:32 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[EntradaReceptor](@nombre VARCHAR(20), @apellidos VARCHAR(20), @NIF VARCHAR(20), @domicilio VARCHAR(20))
as begin
insert into datosReceptor values (@nombre,@apellidos,@NIF,@domicilio)
end
GO
USE [master]
GO
ALTER DATABASE [ProyectoP] SET  READ_WRITE 
GO
