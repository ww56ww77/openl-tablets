package org.openl.rules.repository.db;

final class DatabaseQueries {
    static final String REPOSITORY_NAME = "openl_repository";

    static final String SELECT_ALL_METAINFO = "query.select-all-metainfo";
    static final String SELECT_ALL_HISTORY_METAINFO = "query.select-all-history-metainfo";
    static final String INSERT_FILE = "query.insert-file";
    static final String READ_ACTUAL_FILE = "query.read-actual-file";
    static final String READ_ACTUAL_FILE_METAINFO = "query.read-actual-file-metainfo";
    static final String READ_HISTORIC_FILE = "query.read-historic-file";
    static final String READ_HISTORIC_FILE_METAINFO = "query.read-historic-file-metainfo";
    static final String DELETE_ALL_HISTORY = "query.delete-all-history";
    static final String DELETE_VERSION = "query.delete-version";
    static final String SELECT_MAX_ID = "query.select-max-id";
    static final String COPY_FILE = "query.copy-file";
    static final String COPY_HISTORY = "query.copy-history";

    static final class Initial {
        static final String H2_TABLE = "CREATE TABLE openl_repository (\n"
                + "  id bigint generated by default as identity NOT NULL,\n"
                + "  file_name VARCHAR(1000) NOT NULL,\n"
                + "  file_size BIGINT NOT NULL DEFAULT 0,\n"
                + "  author VARCHAR(45),\n"
                + "  file_comment VARCHAR(255) NULL,\n"
                + "  modified_at TIMESTAMP NOT NULL,\n"
                + "  version VARCHAR(255) NOT NULL,\n"
                + "  file_data blob,\n"
                + "  PRIMARY KEY (id)\n"
                + ");";
        static final String MYSQL_TABLE = "CREATE TABLE openl_repository (\n"
                + "  id BIGINT NOT NULL AUTO_INCREMENT,\n"
                + "  file_name VARCHAR(255) NOT NULL,\n"
                + "  file_size BIGINT NOT NULL DEFAULT 0,\n"
                + "  author VARCHAR(45),\n"
                + "  file_comment VARCHAR(255) NULL,\n"
                + "  modified_at DATETIME NOT NULL,\n"
                + "  version VARCHAR(255) NOT NULL,\n"
                + "  file_data LONGBLOB,\n"
                + "  PRIMARY KEY (id)\n"
                + ");";
        static final String POSTGRESQL_TABLE = "CREATE TABLE openl_repository (\n"
                + "  id BIGSERIAL NOT NULL,\n"
                + "  file_name VARCHAR(1000) NOT NULL,\n"
                + "  file_size BIGINT NOT NULL DEFAULT 0,\n"
                + "  author VARCHAR(45),\n"
                + "  file_comment VARCHAR(255) NULL,\n"
                + "  modified_at TIMESTAMP NOT NULL,\n"
                + "  version VARCHAR(255) NOT NULL,\n"
                + "  file_data BYTEA,\n"
                + "  PRIMARY KEY (id)\n"
                + ");";
        static final String ORACLE_TABLE = "CREATE TABLE openl_repository (\n"
                + "  id NUMBER NOT NULL,\n"
                + "  file_name VARCHAR2(1000) NOT NULL,\n"
                + "  file_size NUMBER DEFAULT 0 NOT NULL,\n"
                + "  author VARCHAR2(45),\n"
                + "  file_comment VARCHAR2(255) NULL,\n"
                + "  modified_at TIMESTAMP NOT NULL,\n"
                + "  version VARCHAR2(255) NOT NULL,\n"
                + "  file_data BLOB,\n"
                + "  PRIMARY KEY (id)\n"
                + ")";
        static final String ORACLE_SEQUENCE = "CREATE SEQUENCE OPENL_REPOSITORY_ID_SEQ START WITH 1";
        static final String ORACLE_TRIGGER = "CREATE OR REPLACE TRIGGER OPENL_REPOSITORY_TRG \n"
                + "BEFORE INSERT ON OPENL_REPOSITORY \n"
                + "FOR EACH ROW\n"
                + "BEGIN\n"
                + "  SELECT OPENL_REPOSITORY_ID_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;\n"
                + "END;";
        static final String SQLSERVER_TABLE = "CREATE TABLE openl_repository (\n"
                + "  id bigint IDENTITY NOT NULL,\n"
                + "  file_name NVARCHAR(1000) NOT NULL,\n"
                + "  file_size BIGINT NOT NULL DEFAULT 0,\n"
                + "  author NVARCHAR(45),\n"
                + "  file_comment NVARCHAR(255) NULL,\n"
                + "  modified_at DATETIME NOT NULL,\n"
                + "  version NVARCHAR(255) NOT NULL,\n"
                + "  file_data VARBINARY(MAX),\n"
                + "  PRIMARY KEY (id)\n"
                + ");";
    }

}
