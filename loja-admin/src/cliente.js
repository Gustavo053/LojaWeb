// in src/enderecos
import * as React from "react";
import { List, Datagrid, TextField, EmailField, SimpleForm, EditButton, Edit, TextInput, NumberInput, Create } from 'react-admin';

export const ClienteList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="id" />
            <TextField source="nome" />
            <EmailField source="email" />
        </Datagrid>
    </List>
);

export const ClienteEdit = props => (
    <Edit {...props}>
        <SimpleForm>
            <TextInput disable source="id" />
            <TextInput source="nome"/>
            <EmailField source="email" />
        </SimpleForm>
    </Edit>
);

export const ClienteCreate = props => (
    <Create {...props}>
        <SimpleForm>
            <TextField source="nome" />
            <EmailField source="email" />
        </SimpleForm>
    </Create>
);
