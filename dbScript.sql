DO $$ 
    
        BEGIN
          CREATE TABLE parameters ( 
			input_1 bigint DEFAULT null,
			input_2 bigint DEFAULT null,
			input_limit bigint DEFAULT null,
			string_1 CHARACTER VARYING DEFAULT null,
			string_2 CHARACTER VARYING DEFAULT null,
			count bigint DEFAULT null
		);
        EXCEPTION
            WHEN duplicate_table THEN RAISE NOTICE 'Table already created ';
        END;
  
$$;

