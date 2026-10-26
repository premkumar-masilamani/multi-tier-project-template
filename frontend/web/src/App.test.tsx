import { render, screen } from '@testing-library/react';
import { describe, expect, it } from 'vitest';
import App from './App.tsx';

describe('App Component', () => {
    it('renders the application title', () => {
        render(<App />);
        expect(screen.getByRole('heading', { name: /SampleApp/i })).toBeInTheDocument();
        expect(screen.getByText(/Empty application template\./i)).toBeInTheDocument();
    });
});
