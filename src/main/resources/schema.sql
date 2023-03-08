CREATE TABLE IF NOT EXISTS user_record(
    id SERIAL, access_token VARCHAR(255) NOT NULL,
    CONSTRAINT pk_user_record PRIMARY KEY(id),
    CONSTRAINT uq_user_record UNIQUE(access_token)
);
