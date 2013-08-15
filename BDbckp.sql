--
-- PostgreSQL database dump
--

-- Dumped from database version 9.2.2
-- Dumped by pg_dump version 9.2.2
-- Started on 2013-08-15 10:36:41

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 1926 (class 1262 OID 49874)
-- Name: ProjetoLabIII; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "ProjetoLabIII" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';


ALTER DATABASE "ProjetoLabIII" OWNER TO postgres;

\connect "ProjetoLabIII"

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 170 (class 3079 OID 11727)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1929 (class 0 OID 0)
-- Dependencies: 170
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 169 (class 1259 OID 49887)
-- Name: alunos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE alunos (
    nome character varying(60),
    idade numeric NOT NULL,
    "endereã§o" character varying(60)
);


ALTER TABLE public.alunos OWNER TO postgres;

--
-- TOC entry 168 (class 1259 OID 49881)
-- Name: treinos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE treinos (
    "exercã­cios" character varying(60),
    "sã©ries" numeric,
    "repetiã§ãµes" numeric
);


ALTER TABLE public.treinos OWNER TO postgres;

--
-- TOC entry 1921 (class 0 OID 49887)
-- Dependencies: 169
-- Data for Name: alunos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO alunos VALUES ('Roberto', 26, 'RuaFeliciano1269');
INSERT INTO alunos VALUES ('Paula', 20, 'AvenidaGregoriano853AP02');
INSERT INTO alunos VALUES ('Jorge', 36, 'RuaCarlosAlmeida963');
INSERT INTO alunos VALUES ('Julia', 19, 'AvenidaSarmen153');


--
-- TOC entry 1920 (class 0 OID 49881)
-- Dependencies: 168
-- Data for Name: treinos; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 1928 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2013-08-15 10:36:42

--
-- PostgreSQL database dump complete
--

