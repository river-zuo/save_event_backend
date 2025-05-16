CREATE TABLE IF NOT EXISTS events (
    transaction_hash VARCHAR(255) PRIMARY KEY,
    event_name VARCHAR(255),
    `from` VARCHAR(255),
    `to` VARCHAR(255),
    value VARCHAR(255),
    address VARCHAR(255),
    topics TEXT,
    data TEXT,
    block_hash VARCHAR(255),
    block_number VARCHAR(255),
    block_timestamp VARCHAR(255),
    transaction_index INTEGER,
    log_index INTEGER,
    removed BOOLEAN
); 