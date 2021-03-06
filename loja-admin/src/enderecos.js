// in src/enderecos
import * as React from "react";
import { List, Datagrid, TextField, EmailField, ReferenceInput, SimpleForm, EditButton, Edit, TextInput, NumberInput, Create } from 'react-admin';

export const EnderecoList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="id" />
            <TextField source="bairro" />
            <TextField label="Cliente" source="cliente.nome" />
            <TextField label="Cliente" source="cliente.email" />
        </Datagrid>
    </List>
);

export const EnderecoEdit = props => (
    <Edit {...props}>
        <SimpleForm>
            <TextInput disable source="id" />
            <TextInput source="bairro"/>
            <ReferenceInput label="Cliente" source="cliente.nome" />
            <ReferenceInput label="Cliente" source="cliente.email" />
        </SimpleForm>
    </Edit>
);

export const EnderecoCreate = props => (
    <Create {...props}>
        <SimpleForm>
            <TextInput source="bairro" />
            {/*<TextInput source="email" />*/}
        </SimpleForm>
    </Create>
);
