-- Seed data initialization for sampleapp_db
-- Schema definitions are tracked in database/migrations/

INSERT INTO samples (id, name)
VALUES ('00000000-0000-0000-0000-000000000001', 'Sample Item')
ON CONFLICT (id) DO NOTHING;
